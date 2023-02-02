package com.example.codepathmail

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EmailAdapter(private val emails: List<Email>) : RecyclerView.Adapter<EmailAdapter.ViewHolder>(){
    // Provide a direct reference to each of the views within a data item
    // Used to cache the views within the item layout for fast access
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val Sender: TextView
        val Title: TextView
        val Summary: TextView


        init {
            Sender = itemView.findViewById(R.id.Sender)
            Title = itemView.findViewById(R.id.Title)
            Summary = itemView.findViewById(R.id.Summary)

        }
    }

    override fun getItemCount(): Int {
        return emails.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val contactView = inflater.inflate(R.layout.email_item, parent, false)
        return ViewHolder(contactView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val email = emails.get(position)
        holder.Sender.text = email.sender
        holder.Title.text = email.title
        holder.Summary.text = email.summary
    }
}