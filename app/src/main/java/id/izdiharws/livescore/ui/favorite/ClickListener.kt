package id.izdiharws.livescore.ui.favorite

import id.izdiharws.livescore.data.db.entities.EventFavorite

interface ClickListener {
    fun onClickListener(eventFavorite: EventFavorite)
}