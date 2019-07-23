/**
 * This file is part of Graylog.
 *
 * Graylog is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Graylog is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Graylog.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.graylog2.plugin.buffers;

/**
 *
 * @author Lennart Koopmann <lennart@socketfeed.com>
 */
public class BufferOutOfCapacityException extends Exception {
    
    /**
	 * Re-generate if you modify the class structure.
	 */
	private static final long serialVersionUID = -2497994875518554556L;

	public BufferOutOfCapacityException() {
        super();
    }
    
    public BufferOutOfCapacityException(String msg) {
        super(msg);
    }
    
}
