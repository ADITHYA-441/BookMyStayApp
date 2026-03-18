import java.util.*;

public class BookingRequestQueue {

    /* Queue storing booking requests */
    private Queue<Reservation> requestQueue;

    public BookingRequestQueue() {
        requestQueue = new LinkedList<>();
    }

    /* Add booking request */
    public void addRequest(Reservation reservation) {
        requestQueue.offer(reservation);
    }

    /* Get next request */
    public Reservation getNextRequest() {
        return requestQueue.poll();
    }

    /* Check if queue has pending requests */
    public boolean hasPendingRequests() {
        return !requestQueue.isEmpty();
    }
}