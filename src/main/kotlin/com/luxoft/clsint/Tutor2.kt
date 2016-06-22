package com.luxoft.clsint

import java.time.LocalDate

/**
 * Create model of Pet Clinic:
 *
 * Abstract:
 * Named (name)
 * Person(first name, last name)
 * PetType is Named()
 * Specialty is Name()
 *
 * Normal
 * Owner is Person (address, city, phone, [pets])
 * Pet is Named (birthDate, type, owner, [visits])
 * Vet is Person ([specialties])
 * Visit (date, description, pet)
 */

open class Named(val name: String)

open class Person(val firstName: String, val lastName: String)

class PetType(name: String) : Named(name)

class Specialty(name: String) : Named(name)

class Owner(firstName: String, lastName: String, var address: String, var city: String, var phone: String, val pets: MutableList<Pet> = mutableListOf()) : Person(firstName, lastName)

class Pet(name: String, val birthDate: LocalDate, val type: PetType, var owner: Owner, val visits: MutableList<Visit> = mutableListOf()) : Named(name)

class Visit(val birthDate: LocalDate, val description: String, val pet: Pet)

class Vet(firstName: String, lastName: String, val specialities: List<Specialty> = mutableListOf()) : Person(firstName, lastName)