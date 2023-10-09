package com.cloudjiashhub.notes.feature_note.presentation.display_notes

import com.cloudjiashhub.notes.feature_note.domain.model.Note
import com.cloudjiashhub.notes.feature_note.domain.util.NoteOrder
import com.cloudjiashhub.notes.feature_note.domain.util.OrderType

data class NotesState(
    val notes: List<Note?> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSelectionVisible: Boolean = false,
)