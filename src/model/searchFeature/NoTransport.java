package model.searchFeature;

import java.util.List;

import model.rawData.RouteQueue;
import model.skeleton.SearchFilter;

public class NoTransport implements SearchFilter {

	@Override
	public List<RouteQueue> filter(List<RouteQueue> rQ) {
		return null;
	}

}
