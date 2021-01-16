package id.izdiharws.livescore.ui.event

import id.izdiharws.livescore.data.model.Event

interface EventView{
    fun showLoading()
    fun hideLoading()
    fun showEventList(data: List<Event>)
}