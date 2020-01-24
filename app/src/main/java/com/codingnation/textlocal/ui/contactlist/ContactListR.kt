package com.codingnation.textlocal.ui.contactlist

/**
 * Created by dr on 26/10/18.
 * On ShoingFest
 */
data class ContactListR(
        var contacts: List<Contacts>? = null
)

data class Contacts(
        var firstName: String?,
        var lastName: String,
        var imageUrl: String,
        var description: String?,
        var phoneNumber: String
)
