package com.luxoft.dc

import java.time.LocalDate

/**
 * Transform classes from Tutor 2 (Pet Clinic) into data classes
 *
 * Remember that DC cannot extends and be extended
 * Use Interfaces
 *
 */
data class PetType(val name: String)

open class Specialty(val name: String)

open class Owner(val firstName: String, val lastName: String, var address: String, var city: String, var phone: String, val pets: List<Pet> = mutableListOf())

open class Pet(val name: String, val birthDate: LocalDate, val type: PetType, var owner: Owner, val visits: List<Visit> = mutableListOf())

open class Visit(val birthDate: LocalDate, val description: String, val pet: Pet)

open class Vet(val firstName: String, val lastName: String, val specialities: List<Specialty> = mutableListOf())
