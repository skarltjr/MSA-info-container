package com.example.k8smsainfo.info.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class info(
    @field:Id
    @field:GeneratedValue
    val id: Long?,
    val movieNumber: Int,
    val title: String,
    val content: String
)