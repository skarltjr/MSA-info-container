package com.example.k8smsainfo.info.controller

import com.example.k8smsainfo.info.model.request.UpdateRequest
import com.example.k8smsainfo.info.model.request.infoRequest
import com.example.k8smsainfo.info.service.InfoService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/info")
class InfoController(
    private val infoService: InfoService
) {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun createInfo(@RequestBody req: infoRequest) {
        infoService.createInfo(req)
    }

    @GetMapping("/{movieNum}")
    @ResponseStatus(HttpStatus.OK)
    fun getInfo(@PathVariable movieNum: Int): ResponseEntity<Any> {
        val res = infoService.getInfo(movieNum)
        return ResponseEntity.ok().body(res)
    }

    @DeleteMapping("/{movieNum}")
    @ResponseStatus(HttpStatus.OK)
    fun deleteInfo(@PathVariable movieNum: Int) {
        infoService.deleteInfo(movieNum)
    }

    @PostMapping("/{movieNum}")
    @ResponseStatus(HttpStatus.OK)
    fun updateInfo(@PathVariable movieNum: Int, @RequestBody req: UpdateRequest):ResponseEntity<Any> {
        val res = infoService.updateInfo(movieNum, req)
        return ResponseEntity.ok().body(res)
    }
}