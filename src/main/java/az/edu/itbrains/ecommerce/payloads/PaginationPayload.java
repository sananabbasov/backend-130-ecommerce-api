package az.edu.itbrains.ecommerce.payloads;



import java.util.List;


public class PaginationPayload<T> {
    private int pageNumber;
    private int pageSize;
    private long totalElements;
    private int totalPages;
    private boolean lastPage;
    private List<T> data;
}