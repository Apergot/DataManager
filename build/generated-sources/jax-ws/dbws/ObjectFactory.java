
package dbws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the dbws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _InsertDB_QNAME = new QName("http://insert/", "insertDB");
    private final static QName _GetReservation_QNAME = new QName("http://insert/", "getReservation");
    private final static QName _GetReservationResponse_QNAME = new QName("http://insert/", "getReservationResponse");
    private final static QName _InsertDBResponse_QNAME = new QName("http://insert/", "insertDBResponse");
    private final static QName _GetReservationIdResponse_QNAME = new QName("http://insert/", "getReservationIdResponse");
    private final static QName _GetReservationId_QNAME = new QName("http://insert/", "getReservationId");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: dbws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetReservationId }
     * 
     */
    public GetReservationId createGetReservationId() {
        return new GetReservationId();
    }

    /**
     * Create an instance of {@link GetReservationIdResponse }
     * 
     */
    public GetReservationIdResponse createGetReservationIdResponse() {
        return new GetReservationIdResponse();
    }

    /**
     * Create an instance of {@link GetReservationResponse }
     * 
     */
    public GetReservationResponse createGetReservationResponse() {
        return new GetReservationResponse();
    }

    /**
     * Create an instance of {@link InsertDBResponse }
     * 
     */
    public InsertDBResponse createInsertDBResponse() {
        return new InsertDBResponse();
    }

    /**
     * Create an instance of {@link InsertDB }
     * 
     */
    public InsertDB createInsertDB() {
        return new InsertDB();
    }

    /**
     * Create an instance of {@link GetReservation }
     * 
     */
    public GetReservation createGetReservation() {
        return new GetReservation();
    }

    /**
     * Create an instance of {@link Reservation }
     * 
     */
    public Reservation createReservation() {
        return new Reservation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertDB }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://insert/", name = "insertDB")
    public JAXBElement<InsertDB> createInsertDB(InsertDB value) {
        return new JAXBElement<InsertDB>(_InsertDB_QNAME, InsertDB.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReservation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://insert/", name = "getReservation")
    public JAXBElement<GetReservation> createGetReservation(GetReservation value) {
        return new JAXBElement<GetReservation>(_GetReservation_QNAME, GetReservation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReservationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://insert/", name = "getReservationResponse")
    public JAXBElement<GetReservationResponse> createGetReservationResponse(GetReservationResponse value) {
        return new JAXBElement<GetReservationResponse>(_GetReservationResponse_QNAME, GetReservationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertDBResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://insert/", name = "insertDBResponse")
    public JAXBElement<InsertDBResponse> createInsertDBResponse(InsertDBResponse value) {
        return new JAXBElement<InsertDBResponse>(_InsertDBResponse_QNAME, InsertDBResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReservationIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://insert/", name = "getReservationIdResponse")
    public JAXBElement<GetReservationIdResponse> createGetReservationIdResponse(GetReservationIdResponse value) {
        return new JAXBElement<GetReservationIdResponse>(_GetReservationIdResponse_QNAME, GetReservationIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReservationId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://insert/", name = "getReservationId")
    public JAXBElement<GetReservationId> createGetReservationId(GetReservationId value) {
        return new JAXBElement<GetReservationId>(_GetReservationId_QNAME, GetReservationId.class, null, value);
    }

}
