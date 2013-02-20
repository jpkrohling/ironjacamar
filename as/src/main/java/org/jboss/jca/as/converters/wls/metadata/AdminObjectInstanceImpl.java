/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2013, Red Hat Middleware LLC, and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.jboss.jca.as.converters.wls.metadata;

import org.jboss.jca.as.converters.wls.api.metadata.AdminObjectInstance;
import org.jboss.jca.as.converters.wls.api.metadata.ConfigProperties;

/**
*
* A generic AdminObjectInstance.
*
* @author <a href="jeff.zhang@jboss.org">Jeff Zhang</a>
*
*/
public class AdminObjectInstanceImpl implements AdminObjectInstance
{
   /** The serialVersionUID */
   private static final long serialVersionUID = -2654156739973657322L;

   private final String jndiName;
   private final ConfigProperties props;
   
   /**
    * constructor 
    * 
    * @param jndiName jndi name 
    * @param props ConfigProperties
    */
   public AdminObjectInstanceImpl(String jndiName, ConfigProperties props)
   {
      this.jndiName = jndiName;
      this.props = props;
   }
   
   /* (non-Javadoc)
    * @see org.jboss.jca.as.converters.wls.api.metadata.AdminObjectInstance#getJndiName()
    */
   @Override
   public String getJndiName()
   {
      return jndiName;
   }

   /* (non-Javadoc)
    * @see org.jboss.jca.as.converters.wls.api.metadata.AdminObjectInstance#getProperties()
    */
   @Override
   public ConfigProperties getProperties()
   {
      return props;
   }

}
