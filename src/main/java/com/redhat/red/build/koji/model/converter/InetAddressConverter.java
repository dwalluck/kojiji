/*
 * Copyright (C) 2015 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.redhat.red.build.koji.model.converter;

import org.commonjava.rwx.core.Converter;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressConverter
                implements Converter<InetAddress>
{
    @Override
    public InetAddress parse( Object object )
    {
        if ( object == null )
        {
            return null;
        }

        try
        {
            return InetAddress.getByName( String.valueOf( object ) );
        }
        catch ( UnknownHostException e )
        {
            return null;
        }
    }

    @Override
    public Object render( InetAddress value )
    {
        if ( value == null )
        {
            return null;
        }

        return value.getHostAddress();
    }
}
