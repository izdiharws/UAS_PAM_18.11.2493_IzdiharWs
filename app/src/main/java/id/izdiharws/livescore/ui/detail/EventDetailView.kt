package id.izdiharws.livescore.ui.detail


import id.izdiharws.livescore.data.model.EventDetail

interface EventDetailView{
    fun showLoading()
    fun hideLoading()
    fun showEventDetail(data: List<EventDetail>)
}