package no.liflig.logging.http4k

import no.liflig.logging.ErrorLog
import no.liflig.logging.NormalizedStatus
import org.http4k.core.RequestContexts
import org.http4k.lens.RequestContextKey
import java.util.UUID

fun createErrorLogLens(contexts: RequestContexts) =
  RequestContextKey.optional<ErrorLog>(contexts)

fun createRequestIdChainLens(contexts: RequestContexts) =
  RequestContextKey.required<List<UUID>>(contexts)

fun createNormalizedStatusLens(contexts: RequestContexts) =
  RequestContextKey.optional<NormalizedStatus>(contexts)
