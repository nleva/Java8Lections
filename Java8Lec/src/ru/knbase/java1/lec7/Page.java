package ru.knbase.java1.lec7;

import java.util.List;

public class Page<T> {
	T field;
	List<T> items;
	int totalPages;
	int currentPage;
	int pageSize;

	public T getField() {
		return field;
	}

	public void setField(T field) {
		this.field = field;
	}

	public List<T> getItems() {
		return items;
	}

	public void setItems(List<T> items) {
		this.items = items;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
}
