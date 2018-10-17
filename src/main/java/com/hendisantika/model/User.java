/**
 *
 */
package com.hendisantika.model;

import lombok.Data;
import lombok.ToString;

/**
 * @author hendisantika
 */

@Data
@ToString
public class User {
    private Integer userId;
    private String userName;
    private String userEmail;
    private String address;

}
