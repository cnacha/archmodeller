package nz.auckland.arch.viewpoint.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class SequencedProperties extends Properties {

	  private Set<Object> keySet = new LinkedHashSet<Object>(100);

	  @Override
	  public Enumeration<Object> keys() {
	    return Collections.enumeration(keySet);
	  }

	  @Override
	  public Set<Object> keySet() {
	    return keySet;
	  }

	  @Override
	  public synchronized Object put(Object key, Object value) {
	    if (! keySet.contains(key)) {
	        keySet.add(key);
	    }
	    return super.put(key, value);
	  }

	  @Override
	  public synchronized Object remove(Object key) {
	    keySet.remove(key);
	    return super.remove(key);
	  }

	  @Override
	  public synchronized void putAll(Map values) {
	    for (Object key : values.keySet()) {
	        if (! containsKey(key)) {
	            keySet.add(key);
	        }
	    }
	    super.putAll(values);
	  }

}