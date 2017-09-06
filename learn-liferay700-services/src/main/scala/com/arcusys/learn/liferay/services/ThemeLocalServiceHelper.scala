package com.arcusys.learn.liferay.services

import com.liferay.portal.kernel.service.{LayoutSetPrototypeServiceUtil, ThemeLocalServiceUtil}
import com.arcusys.learn.liferay.LiferayClasses.LTheme
import scala.collection.JavaConverters._

/**
  * Created by amikhailov on 23.11.16.
  */
object ThemeLocalServiceHelper {

  def getThemes(companyId: Long): Seq[LTheme] =
    ThemeLocalServiceUtil.getThemes(companyId).asScala.filter(!_.isControlPanelTheme)

  def fetchTheme(companyId: Long, themeId: String): Option[LTheme] =
    Option(ThemeLocalServiceUtil.fetchTheme(companyId, themeId))
}