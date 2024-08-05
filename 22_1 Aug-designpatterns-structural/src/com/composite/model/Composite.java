package com.composite.model;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
	private List<Component> components = new ArrayList<>();

	public void addComponent(Component component) {
		components.add(component);
	}

	@Override
	public void showDetails() {
		for (Component component : components) {
			component.showDetails();
		}
	}
}
