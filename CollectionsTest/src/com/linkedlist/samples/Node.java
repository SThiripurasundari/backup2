package com.linkedlist.samples;

public class Node {

	String data;

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public Node left, right;
	int intdata;

	public int getIntdata() {
		return intdata;
	}

	public void setIntdata(int intdata) {
		this.intdata = intdata;
	}

	public Node(String data) {
		this.data = data;
		left = null;
		right = null;

	}

	public Node(int intdata) {
		this.intdata = intdata;
		left = null;
		right = null;

	}

}
