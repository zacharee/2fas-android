package com.twofasapp.base

import java.util.UUID

abstract class UiEvent {
    val id: String = UUID.randomUUID().toString()
}