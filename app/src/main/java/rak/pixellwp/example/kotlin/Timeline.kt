package rak.pixellwp.example.kotlin

import rak.pixellwp.cycling.models.Palette

class Timeline(entries: Map<String, String>, palettes: List<Palette>) {
    var timeToPalette: Map<Int, Palette> = parseEntries(entries, palettes)

    private fun parseEntries(entries: Map<String, String>, palettes: List<Palette>): Map<Int, Palette> {
        throw NotImplementedError()
    }

}