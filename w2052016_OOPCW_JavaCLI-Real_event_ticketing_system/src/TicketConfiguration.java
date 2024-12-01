public class TicketConfiguration {
    private int totalTickets;
    private int ticketReleaseRate;
    private int customerRetrievalRate;
    private int maxTicketCapacity;

    public int getTotalTickets(){
        return totalTickets;
    }
    public int getTicketReleaseRate(){
        return ticketReleaseRate;
    }
    public int getCustomerRetrievalRate(){
        return customerRetrievalRate;
    }
    public int getMaxTicketCapacity(){
        return maxTicketCapacity;
    }
    public void setTotalTickets(int totalTickets){
        this.totalTickets=totalTickets;
    }
    public void setTicketReleaseRate(int ticketReleaseRate){
        this.ticketReleaseRate=ticketReleaseRate;
    }
    public void setCustomerRetrievalRate(int customerRetrievalRate){
        this.customerRetrievalRate=customerRetrievalRate;
    }
    public void setMaxTicketCapacity(int maxTicketCapacity){
        this.maxTicketCapacity=maxTicketCapacity;
    }
}