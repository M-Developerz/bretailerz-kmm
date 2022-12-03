package org.mdeveloperz.mobile.common.ios

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform