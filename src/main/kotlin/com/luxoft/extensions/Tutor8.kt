package com.luxoft.extensions

import java.time.LocalDate

/**
 * Create report class that will be print visits.
 *
 * For Pet, Owner and Vet add extension that will map object to simple Structured String (simple JSON) e.g.:
 *
 * Pet(date, type, owner, [visit]) →
 * {
 *      date: "",
 *      type: {
 *              name: ""
 *          },
 *      owner: {
 *              ...
 *          }
 *      visits: [
 *          {},{},...
 *      ]
 * }
 */
fun asJson(a: Any?): String? {

//    fun PetType.asJson():String{
//        return """{
//                "name": "$name"
//            }
//        """
//    }
//
//    fun Pet.asJson():String{
//        return """
//            {
//                "date": $birthDate,
//                "type": ${asJson(type)}
//            }
//        """
//    }
//
    return when(a){
//        is Pet -> a.asJson()
//        is PetType -> a.asJson()
        else -> ""
    }
}

