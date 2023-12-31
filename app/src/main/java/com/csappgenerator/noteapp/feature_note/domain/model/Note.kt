package com.cloudjiashhub.notes.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.cloudjiashhub.notes.ui.theme.*

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey
    val id: Int? = null
) {
    companion object {
        val listColors = listOf(PinkLavender, MagicMint, NadeshikoPink, UranianBlue, PeachPuff)
    }
}

class InvalidNoteException(message: String) : Exception(message)
