package com.example.k8smsainfo.info.service

import com.example.k8smsainfo.info.model.info
import com.example.k8smsainfo.info.model.request.infoRequest
import com.example.k8smsainfo.info.model.response.infoResponse
import com.example.k8smsainfo.info.repository.InfoRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class InfoService(private val infoRepository:InfoRepository)
{
    fun createInfo(req: infoRequest) {
        val info = info(
            id = null,
            movieNumber = req.movieNumber,
            title = req.title,
            content = req.content
        )
        infoRepository.save(info)
    }

    fun getInfo(movieNum: Int):infoResponse {
        val info = infoRepository.findByMovieNumber(movieNum)
        val res = infoResponse(
            movieNumber = info.movieNumber,
            title = info.title,
            content = info.content
        )
        return res
    }

    fun deleteInfo(movieNum: Int) {
        infoRepository.deleteByMovieNumber(movieNum)
    }
}