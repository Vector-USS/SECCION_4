package grailstest


import grails.rest.*
import grails.converters.*

class ShipController extends RestfulController {
    static responseFormats = ['json', 'xml']
    ShipController() {
        super(Ship)
    }

}
