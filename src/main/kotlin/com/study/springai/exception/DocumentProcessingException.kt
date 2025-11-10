package com.study.springai.exception

import org.springframework.http.HttpStatus
import org.springframework.web.server.ResponseStatusException

// 문서 처리 관련 커스텀 예외
class DocumentProcessingException(message: String, cause: Throwable? = null) :
    ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, message, cause)
