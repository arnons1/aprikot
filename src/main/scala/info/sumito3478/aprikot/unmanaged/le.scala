/* Copyright (C) 2013 sumito3478 <sumito3478@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package info.sumito3478
package aprikot.unmanaged

/**
 * Converts an integral value to the little-endian value.
 */
object le {
  private[this] val le = (0xcafebabe >>> 16) == 0xcafe

  def apply(x: Short): Short = {
    if (le) x else bswap(x)
  }

  def apply(x: Int): Int = {
    if (le) x else bswap(x)
  }

  def apply(x: Long): Long = {
    if (le) x else bswap(x)
  }
}