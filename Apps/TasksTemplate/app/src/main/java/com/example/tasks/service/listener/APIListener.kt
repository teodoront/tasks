package com.example.tasks.service.listener

import com.example.tasks.service.HeaderModel

interface APIListener {

    //Interface não tem implementação, só métodos

    fun onSucces(model: HeaderModel)
    fun onFailure(str: String)
}