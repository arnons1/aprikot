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
package aprikot.classic.perseus.db

import scala.slick.driver.BasicDriver.simple._
import Database.threadLocalSession

object PerseusAnalysisDatum extends Table[(String, String, String, String, String)]("PERSEUS_ANALYSIS_DATUM") {
  def key = column[String]("KEY")

  def inflected = column[String]("INFLECTED")

  def lemma = column[String]("LEMMA")

  def vocab = column[String]("VOCAB")

  def inflection = column[String]("INFLECTION")

  def * = key ~ inflected ~ lemma ~ vocab ~ inflection

  def idx = index("idx", key)
}