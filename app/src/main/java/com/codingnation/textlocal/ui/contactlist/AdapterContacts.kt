package com.codingnation.textlocal.ui.contactlist

import android.annotation.SuppressLint
import android.graphics.Color
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.codingnation.textlocal.R
import com.codingnation.textlocal.utils.Utils
import kotlinx.android.synthetic.main.view_item_contacts.view.*

class AdapterContacts constructor(private val contactListR: List<Contacts>, private val contactSelectListner: ContactSelectListner) : RecyclerView.Adapter<AdapterContacts.ReqViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReqViewHolder {
        val itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.view_item_contacts, parent, false)

        return ReqViewHolder(itemView)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ReqViewHolder, position: Int) {
        val contactsDetails = contactListR[position]
        holder.tvIcon.text = contactsDetails.firstName!![0].toString()
        holder.tvName.text = contactsDetails.firstName + " " + contactsDetails.lastName
        holder.tvPhoneNumber.text = contactsDetails.phoneNumber
        holder.tvIcon.setBackgroundColor(Color.parseColor(Utils.getColor()))
        holder.tvInfo.setOnClickListener { contactSelectListner.onContactSelected(contactsDetails) }
    }

    override fun getItemCount(): Int {
        return contactListR.size
    }

    inner class ReqViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvIcon: TextView = view.tvIcon
        val tvName: TextView = view.tvName
        val tvInfo: TextView = view.tvInfo
        val tvPhoneNumber: TextView = view.tvPhoneNumber

    }
}