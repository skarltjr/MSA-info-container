package com.example.k8smsainfo.info.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class info(
    @field:Id
    @field:GeneratedValue
    var id: Long?,
    val movieNumber: Int,
    var title: String,
    var content: String
)