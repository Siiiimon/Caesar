package CleanIO

import java.io.BufferedReader
import java.io.File

class CleanIOImpl: CleanIO {
    override fun read(path: String): String {
        val reader: BufferedReader = File(path).bufferedReader()
        val dirtyContent = reader.use { it.readText() }
        return clean(dirtyContent)
    }

    fun cleanMarksAndWhitespace(dirty: String): String {
        dirty.filter { it.isLetterOrDigit() }
    }

    fun clean(dirty: String): String {
        dirty
            .lowercase()
            .
    }

    override fun write() {
        TODO("Not yet implemented")
    }
}