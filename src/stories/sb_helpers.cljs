(ns stories.sb-helpers
  (:require
   [cljss.core :as css]))

(defn clean []
  (css/remove-styles!))
