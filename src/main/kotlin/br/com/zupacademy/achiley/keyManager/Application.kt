package br.com.zupacademy.achiley.keyManager

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("br.com.zupacademy.achiley.keyManager")
		.start()
}

