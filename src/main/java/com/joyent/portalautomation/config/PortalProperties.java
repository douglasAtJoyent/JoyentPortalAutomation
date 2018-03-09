/**
 *
 */
package com.joyent.portalautomation.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @author DouglasAnderson
 */
public final class PortalProperties {

    /**
     * Utility class needs a private constructor that is never used.
     */
    private PortalProperties() {
        //Never called
    }
    /**
     * This will read the default property file.
     * @return a loaded property object.
     * @throws IOException - if the file can't be read.
     * @throws FileNotFoundException - if the file is not found.
     */
     public static Properties getProperties() throws FileNotFoundException, IOException {
          String rootPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
          String appConfigPath = rootPath + "portal.properties";
          Properties props = new Properties();
          props.load(new FileInputStream(appConfigPath));
          return props;
      }
}
