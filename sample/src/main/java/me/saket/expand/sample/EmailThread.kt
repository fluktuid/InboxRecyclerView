package me.saket.expand.sample

import android.support.v7.util.DiffUtil

data class EmailThread(
    val sender: Person,
    val subject: String,
    val emails: List<Email>
) {

  class ItemDiffer : DiffUtil.ItemCallback<EmailThread>() {
    override fun areItemsTheSame(oldItem: EmailThread, newItem: EmailThread) = oldItem.subject == newItem.subject
    override fun areContentsTheSame(oldItem: EmailThread, newItem: EmailThread) = oldItem == newItem
  }
}