package com.example.fff;

import java.util.LinkedList;

public class main {

	public main() {

		node a = new node("Cheese", 9, 25.10);
		node b = new node("Bread", 3, 5);
		node c = new node("Grapes", 2.24, 2);
		node d = new node("Hummus", 5, 6);
		node e = new node("Mushroom", 1.50, 3);
		node f = new node("Cinnamon bark", 1, 1);
		node g = new node("Steak", 15, 10);
		node h = new node("Fish", 8, 8);
		node a1 = new node("Candy", 3, 7);
		node b1 = new node("Chocolate", 2.50, 8);
		node c1 = new node("porridge", 2, 2);
		node d1 = new node("watermelon", 4.50, 5);
		node e1 = new node("rice", 3, 5);
		node f1 = new node("pizza", 10, 10);
		node g1 = new node("soda", 2, 3);
		node h1 = new node("chicken", 6, 7);
		node a3 = new node("Pudding", 2, 3);
		node b3 = new node("Chinese Food", 4, 7);

		LinkedList<node> items = new LinkedList<node>();
		items.add(a);
		items.add(b);
		items.add(c);
		items.add(d);
		items.add(e);
		items.add(f);
		items.add(g);
		items.add(h);
		items.add(a1);
		items.add(b1);
		items.add(a1);
		items.add(b1);
		items.add(c1);
		items.add(d1);
		items.add(e1);
		items.add(f1);
		items.add(g1);
		items.add(h1);
		double maximum = 30;

		int speed = 10000; // don't set more than 10 Million
		LinkedList<node> output = new LinkedList<node>();

		bruteforce(items, maximum, speed);
		for (int i = 0; i < items.size(); i++) {
			System.out.println(items.get(i).isTake() + ", "
					+ items.get(i).getName());
		}
	}

	public static void bruteforce(LinkedList<node> items, double maximum,
			int speed) {
		int max = 0;
		for (int j = 0; j < speed; j++) {
			int temp_benefit = 0;
			int temp_cost = 0;
			for (int i = 0; i < items.size(); i++) {
				items.get(i).setStatus(Math.round(Math.random()));
				temp_benefit += items.get(i).getStatus()
						* items.get(i).getBenefit();
				temp_cost += items.get(i).getStatus() * items.get(i).getCost();
			}
			if (temp_cost <= maximum && temp_benefit > max) {
				max = temp_benefit;
				for (int k = 0; k < items.size(); k++) {
					// System.out.print(items.get(k).getStatus()+ ", ");
					items.get(k).setTake(items.get(k).getStatus());
				}
				// System.out.println( temp_benefit + " " + temp_cost);
			}
		}
	}
}