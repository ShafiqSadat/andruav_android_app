/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE UAVIONIX_ADSB_OUT_CFG_REGISTRATION PACKING
package com.MAVLink.uAvionix;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.messages.MAVLinkMessage;
import com.MAVLink.messages.MAVLinkPayload;
import com.MAVLink.messages.Units;
import com.MAVLink.messages.Description;

/**
 * Aircraft Registration.
 */
public class msg_uavionix_adsb_out_cfg_registration extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_UAVIONIX_ADSB_OUT_CFG_REGISTRATION = 10004;
    public static final int MAVLINK_MSG_LENGTH = 9;
    private static final long serialVersionUID = MAVLINK_MSG_ID_UAVIONIX_ADSB_OUT_CFG_REGISTRATION;

    
    /**
     * Aircraft Registration (ASCII string A-Z, 0-9 only), e.g. 'N8644B '. Trailing spaces (0x20) only. This is null-terminated.
     */
    @Description("Aircraft Registration (ASCII string A-Z, 0-9 only), e.g. 'N8644B '. Trailing spaces (0x20) only. This is null-terminated.")
    @Units("")
    public byte registration[] = new byte[9];
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_UAVIONIX_ADSB_OUT_CFG_REGISTRATION;

        
        for (int i = 0; i < registration.length; i++) {
            packet.payload.putByte(registration[i]);
        }
                    
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a uavionix_adsb_out_cfg_registration message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();

        
        for (int i = 0; i < this.registration.length; i++) {
            this.registration[i] = payload.getByte();
        }
                
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_uavionix_adsb_out_cfg_registration() {
        this.msgid = MAVLINK_MSG_ID_UAVIONIX_ADSB_OUT_CFG_REGISTRATION;
    }

    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_uavionix_adsb_out_cfg_registration( byte[] registration) {
        this.msgid = MAVLINK_MSG_ID_UAVIONIX_ADSB_OUT_CFG_REGISTRATION;

        this.registration = registration;
        
    }

    /**
     * Constructor for a new message, initializes everything
     */
    public msg_uavionix_adsb_out_cfg_registration( byte[] registration, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_UAVIONIX_ADSB_OUT_CFG_REGISTRATION;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.registration = registration;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_uavionix_adsb_out_cfg_registration(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_UAVIONIX_ADSB_OUT_CFG_REGISTRATION;

        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

     
    /**
    * Sets the buffer of this message with a string, adds the necessary padding
    */
    public void setRegistration(String str) {
        int len = Math.min(str.length(), 9);
        for (int i=0; i<len; i++) {
            registration[i] = (byte) str.charAt(i);
        }

        for (int i=len; i<9; i++) {            // padding for the rest of the buffer
            registration[i] = 0;
        }
    }

    /**
    * Gets the message, formatted as a string
    */
    public String getRegistration() {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < 9; i++) {
            if (registration[i] != 0)
                buf.append((char) registration[i]);
            else
                break;
        }
        return buf.toString();

    }
                         
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_UAVIONIX_ADSB_OUT_CFG_REGISTRATION - sysid:"+sysid+" compid:"+compid+" registration:"+registration+"";
    }

    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_UAVIONIX_ADSB_OUT_CFG_REGISTRATION";
    }
}
        