(defproject closerve-contrib "0.1.0-SNAPSHOT"
  :description "Optional modules for CloServe"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [ragge/core.async "0.1.0-SNAPSHOT"]
                 [hickory "0.5.1"]
                 [org.clojure/java.jdbc "0.3.0-alpha5"]
                 [mysql/mysql-connector-java "5.1.6"]
                 [korma "0.3.0-RC6"]
                 [log4j "1.2.15" :exclusions [javax.mail/mail
                                              javax.jms/jms
                                              com.sun.jdmk/jmxtools
                                              com.sun.jmx/jmxri]]
                 [closerve "0.2.0-SNAPSHOT"]])
