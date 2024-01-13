package com.qa.BootCamp_Diffiult_Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class DijkstraShortestPath {
	static class Edge {
		int destination;
		int weight;

		public Edge(int destination, int weight) {
			this.destination = destination;
			this.weight = weight;
		}
	}

	static class Graph {
		int vertices;
		List<List<Edge>> adjacencyList;

		public Graph(int vertices) {
			this.vertices = vertices;
			this.adjacencyList = new ArrayList<>(vertices);

			for (int i = 0; i < vertices; i++) {
				this.adjacencyList.add(new ArrayList<Edge>());
			}
		}

		public void addEdge(int source, int destination, int weight) {
			Edge edge = new Edge(destination, weight);
			adjacencyList.get(source).add(edge);
		}

		public int[] dijkstra(int source) {
			final int[] distance = new int[vertices];
			Arrays.fill(distance, Integer.MAX_VALUE);
			distance[source] = 0;

			PriorityQueue<Integer> minHeap = new PriorityQueue<>(new Comparator<Integer>() {
				@Override
				public int compare(Integer index1, Integer index2) {
					return Integer.compare(distance[index1], distance[index2]);
				}
			});

			minHeap.add(source);

			while (!minHeap.isEmpty()) {
				int current = minHeap.poll();

				for (Edge edge : adjacencyList.get(current)) {
					int newDistance = distance[current] + edge.weight;
					if (newDistance < distance[edge.destination]) {
						distance[edge.destination] = newDistance;
						minHeap.add(edge.destination);
					}
				}
			}

			return distance;
		}
	}

	public static void main(String[] args) {
		int vertices = 5;
		Graph graph = new Graph(vertices);

		graph.addEdge(0, 1, 2);
		graph.addEdge(0, 2, 4);
		graph.addEdge(1, 2, 1);
		graph.addEdge(1, 3, 7);
		graph.addEdge(2, 4, 3);
		graph.addEdge(3, 4, 1);

		int source = 0;

		int[] shortestDistance = graph.dijkstra(source);

		System.out.println("Shortest distance from source " + source + " to each vertex:");
		for (int i = 0; i < vertices; i++) {
			System.out.println("Vertex " + i + ": " + shortestDistance[i]);
		}
	}
}
