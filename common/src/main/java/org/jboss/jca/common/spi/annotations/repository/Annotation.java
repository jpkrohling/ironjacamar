/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2008, Red Hat Middleware LLC, and individual contributors
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
package org.jboss.jca.common.spi.annotations.repository;

import java.util.List;

/**
 *
 * A Annotation.
 *
 * @author <a href="stefano.maestri@jboss.com">Stefano Maestri</a>
 *
 */
public interface Annotation
{

   /**
    *
    * get the class Name of this annotation
    *
    * @return the classname
    */
   public String getClassName();

   /**
    *
    * Get the Annotation Object
    *
    * @return te java.lang.Annotation instance
    */
   public Object getAnnotation();

   /**
    *
    * get the list of parameters type for this annotation
    *
    * @return list of parameters types
    */
   public List<String> getParameterTypes();

   /**
    *
    * get the member name
    *
    * @return member name
    */
   public String getMemberName();

   /**
    *
    * check if the annotation is on a method
    *
    * @return true if the annotation is attached to a method
    */
   boolean isOnMethod();

   /**
    *
    * check if the annotation is on a field
    *
    * @return true if the annotation is attached to a field
    */
   boolean isOnField();

}

