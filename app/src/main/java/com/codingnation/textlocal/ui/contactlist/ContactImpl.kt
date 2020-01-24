package com.codingnation.textlocal.ui.contactlist

import com.codingnation.textlocal.utils.Utils


class ContactImpl internal constructor(view: ContactView) : ContactPresenter {
    internal var TAG = ContactImpl::class.java.simpleName

    init {
        contactView = view
    }

    companion object {
        private lateinit var contactView: ContactView
    }


    override fun getContacts() {
        Utils.logD(TAG, "requestToServer()")
        contactView.showProgress()
        val data = "{\n" +
                "  \"contacts\": [\n" +
                "    {\n" +
                "      \"firstName\": \"Devendra\",\n" +
                "      \"lastName\": \"Singh\",\n" +
                "      \"phoneNumber\": \"98101532609810153260\",\n" +
                "      \"description\": \"android developer\",\n" +
                "      \"imageUrl\": \"https://loremflickr.com/320/240\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"firstName\": \"Rahul\",\n" +
                "      \"lastName\": \"Kumar\",\n" +
                "      \"phoneNumber\": \"Edit your number in ContactImpl.kt\",\n" +
                "      \"description\": \"android developer\",\n" +
                "      \"imageUrl\": \"https://loremflickr.com/320/240\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"firstName\": \"Paul\",\n" +
                "      \"lastName\": \"Walker\",\n" +
                "      \"phoneNumber\": \"Edit your number in ContactImpl.kt\",\n" +
                "      \"description\": \"android developer\",\n" +
                "      \"imageUrl\": \"https://loremflickr.com/320/240\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"firstName\": \"Praveen\",\n" +
                "      \"lastName\": \"Kanwar\",\n" +
                "      \"phoneNumber\": \"Edit your number in ContactImpl.kt\",\n" +
                "      \"description\": \"android developer\",\n" +
                "      \"imageUrl\": \"https://loremflickr.com/320/240\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"firstName\": \"Hitesh\",\n" +
                "      \"lastName\": \"Singh\",\n" +
                "      \"phoneNumber\": \"Edit your number in ContactImpl.kt\",\n" +
                "      \"description\": \"android developer\",\n" +
                "      \"imageUrl\": \"https://loremflickr.com/320/240\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"firstName\": \"Surbhi\",\n" +
                "      \"lastName\": \"Sharma\",\n" +
                "      \"phoneNumber\": \"Edit your number in ContactImpl.kt\",\n" +
                "      \"description\": \"android developer\",\n" +
                "      \"imageUrl\": \"https://loremflickr.com/320/240\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"firstName\": \"Devendra\",\n" +
                "      \"lastName\": \"Singh\",\n" +
                "      \"phoneNumber\": \"Edit your number in ContactImpl.kt\",\n" +
                "      \"description\": \"android developer\",\n" +
                "      \"imageUrl\": \"https://loremflickr.com/320/240\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"firstName\": \"Rahul\",\n" +
                "      \"lastName\": \"Kumar\",\n" +
                "      \"phoneNumber\": \"Edit your number in ContactImpl.kt\",\n" +
                "      \"description\": \"android developer\",\n" +
                "      \"imageUrl\": \"https://loremflickr.com/320/240\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"firstName\": \"Paul\",\n" +
                "      \"lastName\": \"Walker\",\n" +
                "      \"phoneNumber\": \"Edit your number in ContactImpl.kt\",\n" +
                "      \"description\": \"android developer\",\n" +
                "      \"imageUrl\": \"https://loremflickr.com/320/240\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"firstName\": \"Praveen\",\n" +
                "      \"lastName\": \"Kanwar\",\n" +
                "      \"phoneNumber\": \"Edit your number in ContactImpl.kt\",\n" +
                "      \"description\": \"android developer\",\n" +
                "      \"imageUrl\": \"https://loremflickr.com/320/240\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"firstName\": \"Hitesh\",\n" +
                "      \"lastName\": \"Singh\",\n" +
                "      \"phoneNumber\": \"Edit your number in ContactImpl.kt\",\n" +
                "      \"description\": \"android developer\",\n" +
                "      \"imageUrl\": \"https://loremflickr.com/320/240\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"firstName\": \"Surbhi\",\n" +
                "      \"lastName\": \"Sharma\",\n" +
                "      \"phoneNumber\": \"Edit your number in ContactImpl.kt\",\n" +
                "      \"description\": \"android developer\",\n" +
                "      \"imageUrl\": \"https://loremflickr.com/320/240\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"firstName\": \"Devendra\",\n" +
                "      \"lastName\": \"Singh\",\n" +
                "      \"phoneNumber\": \"Edit your number in ContactImpl.kt\",\n" +
                "      \"description\": \"android developer\",\n" +
                "      \"imageUrl\": \"https://loremflickr.com/320/240\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"firstName\": \"Rahul\",\n" +
                "      \"lastName\": \"Kumar\",\n" +
                "      \"phoneNumber\": \"Edit your number in ContactImpl.kt\",\n" +
                "      \"description\": \"android developer\",\n" +
                "      \"imageUrl\": \"https://loremflickr.com/320/240\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"firstName\": \"Paul\",\n" +
                "      \"lastName\": \"Walker\",\n" +
                "      \"phoneNumber\": \"Edit your number in ContactImpl.kt\",\n" +
                "      \"description\": \"android developer\",\n" +
                "      \"imageUrl\": \"https://loremflickr.com/320/240\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"firstName\": \"Praveen\",\n" +
                "      \"lastName\": \"Kanwar\",\n" +
                "      \"phoneNumber\": \"Edit your number in ContactImpl.kt\",\n" +
                "      \"description\": \"android developer\",\n" +
                "      \"imageUrl\": \"https://loremflickr.com/320/240\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"firstName\": \"Hitesh\",\n" +
                "      \"lastName\": \"Singh\",\n" +
                "      \"phoneNumber\": \"Edit your number in ContactImpl.kt\",\n" +
                "      \"description\": \"android developer\",\n" +
                "      \"imageUrl\": \"https://loremflickr.com/320/240\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"firstName\": \"Surbhi\",\n" +
                "      \"lastName\": \"Sharma\",\n" +
                "      \"phoneNumber\": \"Edit your number in ContactImpl.kt\",\n" +
                "      \"description\": \"android developer\",\n" +
                "      \"imageUrl\": \"https://loremflickr.com/320/240\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"firstName\": \"Naveen\",\n" +
                "      \"lastName\": \"Yadav\",\n" +
                "      \"phoneNumber\": \"Edit your number in ContactImpl.kt\",\n" +
                "      \"description\": \"android developer\",\n" +
                "      \"imageUrl\": \"https://loremflickr.com/320/240\"\n" +
                "    }\n" +
                "\n" +
                "  ]\n" +
                "}"

        contactView.hideProgress()
        contactView.renderData(Utils.gson.fromJson(data, ContactListR::class.java))

    }


}
