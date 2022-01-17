package com.example.k8smsainfo.info.repository

import com.example.k8smsainfo.info.model.info
import org.springframework.data.jpa.repository.JpaRepository

interface InfoRepository : JpaRepository<info, Long> {
    fun findByMovieNumber(movieNum: Int):info
    fun deleteByMovieNumber(movieNum: Int)

}