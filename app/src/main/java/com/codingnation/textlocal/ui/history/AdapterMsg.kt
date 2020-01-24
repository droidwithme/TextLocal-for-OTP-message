package com.codingnation.textlocal.ui.history

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.codingnation.textlocal.R
import com.codingnation.textlocal.ui.sendotp.SendOtpQ
import kotlinx.android.synthetic.main.view_item_contacts.view.*

class AdapterMsg constructor(private val msgList: List<SendOtpQ>) : RecyclerView.Adapter<AdapterMsg.ReqViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReqViewHolder {
        val itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.view_item_contacts, parent, false)

        return ReqViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ReqViewHolder, position: Int) {
        val otpDetails = msgList[position]
        holder.tvIcon.text = otpDetails.name[0].toString()
        holder.tvName.text = otpDetails.name
        holder.tvPhoneNumber.text = otpDetails.message
        holder.tvInfo.text = otpDetails.time
    }

    override fun getItemCount(): Int {
        return msgList.size
    }

    inner class ReqViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvIcon = view.tvIcon
        val tvName = view.tvName
        val tvInfo = view.tvInfo
        val tvPhoneNumber = view.tvPhoneNumber

    }
}