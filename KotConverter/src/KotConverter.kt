package com.includehelp.basic

import java.util.*


fun main(args: Array<String>) {

    val sc = Scanner(System.`in`)

    val M2KM = 1.6

    println("Inserisci le miglia da convertire in chilometri  : ")
    val miles: Double = sc.nextDouble()

    println("$miles Corrispondono a :  ${miles * M2KM} chilometri")

}
