


package za.co.discovery.assignment.schema;

import javax.xml.bind.annotation.XmlRegistry;



@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: za.co.discovery.assignment.schema
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetShortestPathResponse }
     * 
     */
    public GetShortestPathResponse createGetShortestPathResponse() {
        return new GetShortestPathResponse();
    }

    /**
     * Create an instance of {@link GetShortestPathRequest }
     * 
     */
    public GetShortestPathRequest createGetShortestPathRequest() {
        return new GetShortestPathRequest();
    }

}
