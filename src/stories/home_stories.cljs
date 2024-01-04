(ns stories.home-stories
  (:require
   [cljss.core :as css]
   [reagent.core :as r]
   [storyvite.core :refer [home-page]]))

(css/remove-styles!)

(def ^:export default
  (clj->js
   {:title "Cljs/Home"
    :component (r/reactify-component home-page)
    :parameters {}
    :args {}}))

(defn ^:export home-basic []
  (r/as-element
   [home-page]))
