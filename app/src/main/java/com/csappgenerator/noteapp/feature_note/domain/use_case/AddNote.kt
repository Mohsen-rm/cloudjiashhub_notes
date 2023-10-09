package com.cloudjiashhub.notes.feature_note.domain.use_case

import com.cloudjiashhub.notes.feature_note.domain.model.InvalidNoteException
import com.cloudjiashhub.notes.feature_note.domain.model.Note
import com.cloudjiashhub.notes.feature_note.domain.repository.NoteRepository

class AddNote(private val repository: NoteRepository) {

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {

        if (note.title.isBlank())
            throw InvalidNoteException("The title of the note cannot be empty.")

        if (note.content.isBlank())
            throw InvalidNoteException("The content of the note cannot be empty.")

        repository.insertNote(note)
    }
}