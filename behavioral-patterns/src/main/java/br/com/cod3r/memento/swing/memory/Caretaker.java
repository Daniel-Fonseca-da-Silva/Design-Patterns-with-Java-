package br.com.cod3r.memento.swing.memory;

import java.util.*;

public class Caretaker {
	private List<Memento> mementos = new ArrayList<Memento>();
	
	public List<Memento> getHistoryList() {
	      return Collections.unmodifiableList(mementos);
	}
	
	public void add(Memento memento) {
		mementos.add(memento);
	}
	
	public Memento get(int index) {
		return mementos.get(index);
	}
}
